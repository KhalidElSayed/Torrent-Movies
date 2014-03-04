#/usr/bin/env bash

# Use in Wercker to upload builds automatically to HockeyApp
# Checks environment variable UPLOAD_TO_HOCKEYAPP=1, so you can have multiple tests on the "development" branch but only upload once.
# Expects an environment variable called HOCKEYAPP_TOKEN which is the API token
cd build
cd apk
ls
if [[ "$UPLOAD_TO_HOCKEYAPP" == "1" ]]; then
      echo "Uploading to HockeyApp, could take a while..."
      curl \
          -F "status=$HA_STATUS_AVAILABLE_FOR_DOWNLOAD" \
          -F "notify=$HA_NOTIFY_NONE" \
          -F "ipa=@$HA_APK_FILE_NAME" \
          -H "X-HockeyAppToken: $HA_TOKEN" \
          https://rink.hockeyapp.net/api/2/apps/$HA_APP_ID/app_versions/upload
else
  echo "UPLOAD_TO_HOCKEYAPP variable not 1, abandoning"
fi
