# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/)
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]
First alpha release.

### Added
A plugin with ID `org.zaproxy.crowdin`.

The plugin provides the following features:

#### Extension
 - `crowdin` to specify the authentication token and the configuration file.

#### Tasks
Added by the plugin:
 - `crowdinBuildProjectTranslation` - Builds the project translation package.
 - `crowdinCopyProjectTranslations` - Copies the project translations to respective directories.
 - `crowdinDownloadProjectTranslation` - Downloads the latest project translation package.
 - `crowdinListAllFiles` - Lists all the files in Crowdin.
 - `crowdinListFiles` - Lists the files in Crowdin (that match the configuration).
 - `crowdinListSourceFiles` - Lists the source files.
 - `crowdinUploadSourceFiles` - Uploads the source files to Crowdin.


[Unreleased]: https://github.com/zaproxy/gradle-plugin-crowdin/compare/f935566adf4ba84f9a15def93643ef2d482ee2fc...HEAD