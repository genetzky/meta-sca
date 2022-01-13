SUMMARY = "go.mod: github.com/gobuffalo/buffalo-pop/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/buffalo-pop/v2"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-buffalo-pop-v2-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-fatih-color \
    nativesdk-github.com-gobuffalo-buffalo \
    nativesdk-github.com-gobuffalo-events \
    nativesdk-github.com-gobuffalo-flect \
    nativesdk-github.com-gobuffalo-genny-v2 \
    nativesdk-github.com-gobuffalo-packr-v2 \
    nativesdk-github.com-gobuffalo-plush-v4 \
    nativesdk-github.com-gobuffalo-pop-v5 \
    nativesdk-github.com-markbates-errx \
    nativesdk-github.com-pkg-errors \
    nativesdk-github.com-sirupsen-logrus \
    nativesdk-github.com-spf13-cobra \
"
GO_IMPORT = "github.com/gobuffalo/buffalo-pop/v2"
inherit gosrc
inherit nativesdk
