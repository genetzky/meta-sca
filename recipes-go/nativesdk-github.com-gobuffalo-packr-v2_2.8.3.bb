SUMMARY = "go.mod: github.com/gobuffalo/packr/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/packr/v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-packr-v2-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-gobuffalo-logger \
    nativesdk-github.com-gobuffalo-packd \
    nativesdk-github.com-karrick-godirwalk \
    nativesdk-github.com-markbates-errx \
    nativesdk-github.com-markbates-oncer \
    nativesdk-github.com-markbates-safe \
    nativesdk-github.com-rogpeppe-go-internal \
    nativesdk-github.com-sirupsen-logrus \
    nativesdk-github.com-spf13-cobra \
    nativesdk-golang.org-x-sync \
    nativesdk-golang.org-x-tools \
"
GO_IMPORT = "github.com/gobuffalo/packr/v2"
inherit gosrc
inherit nativesdk
