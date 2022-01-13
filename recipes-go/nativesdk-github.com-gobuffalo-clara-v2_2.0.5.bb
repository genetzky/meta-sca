SUMMARY = "go.mod: github.com/gobuffalo/clara/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/clara/v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-clara-v2-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-fatih-color \
    nativesdk-github.com-gobuffalo-genny-v2 \
    nativesdk-github.com-gobuffalo-here \
    nativesdk-github.com-gobuffalo-logger \
    nativesdk-github.com-gobuffalo-meta \
    nativesdk-github.com-gobuffalo-plush-v4 \
    nativesdk-github.com-masterminds-semver \
    nativesdk-github.com-spf13-pflag \
"
GO_IMPORT = "github.com/gobuffalo/clara/v2"
inherit gosrc
inherit nativesdk
