# Gautam Patches

Community-maintained patches for Android apps, built for [Morphe](https://github.com/MorpheApp).

## Add this source to Morphe

https://morphe.software/add-source?github=siddharthagautam/gautam-patches

## Available patches

<!-- PATCHES_START EXPANDED -->
> **[v1.0.0-dev.1](https://github.com/siddharthagautam/gautam-patches/releases/tag/v1.0.0-dev.1)**&nbsp;&nbsp;•&nbsp;&nbsp;`dev`&nbsp;&nbsp;•&nbsp;&nbsp;1 patches total
<details open>
<summary>📦 QR Scanner&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

**🎯 Supported versions:**

| 1.0 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Hide banner ads](#hide-banner-ads) | Hides and collapses banner ads on the home and scan-result screens. |  |

</details>

<!-- PATCHES_END -->

## Building locally

1. Configure the GitHub Packages credentials required by Morphe.
2. Run `./gradlew buildAndroid`.
3. Find the generated bundle at `patches/build/libs/patches-*.mpp`.
4. Apply it to the original supported APK using Morphe Desktop.

Do not redistribute third-party APKs. This repository distributes patch code and patch bundles only.

## License

Gautam Patches is licensed under the [GNU General Public License v3.0](LICENSE).
