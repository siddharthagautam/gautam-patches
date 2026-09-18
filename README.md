# Gautam Patches

Community-maintained patches for Android apps, built for [Morphe](https://github.com/MorpheApp).

## Add this source to Morphe

https://morphe.software/add-source?github=siddharthagautam/gautam-patches

## Available patches

<!-- PATCHES_START EXPANDED -->

### QR Scanner

- **Hide banner ads** — collapses the AdMob banner areas on the home and scan-result screens.
- Package: `github.w3apps.com.qrcode`
- Supported version: `1.0`
- Test target: [Sanjnha/Qr-Code-Scanner-Genrator-Android-App-with-Admob](https://github.com/Sanjnha/Qr-Code-Scanner-Genrator-Android-App-with-Admob)

The first patch is under development on the `dev` branch and should be treated as unverified until it has been built and tested on a device.

<!-- PATCHES_END -->

## Building locally

1. Configure the GitHub Packages credentials required by Morphe.
2. Run `./gradlew buildAndroid`.
3. Find the generated bundle at `patches/build/libs/patches-*.mpp`.
4. Apply it to the original supported APK using Morphe Desktop.

Do not redistribute third-party APKs. This repository distributes patch code and patch bundles only.

## License

Gautam Patches is licensed under the [GNU General Public License v3.0](LICENSE).
