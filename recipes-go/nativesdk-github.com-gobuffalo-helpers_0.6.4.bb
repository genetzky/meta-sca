SUMMARY = "go.mod: github.com/gobuffalo/helpers"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/helpers"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-helpers-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-gobuffalo-flect \
    nativesdk-github.com-gobuffalo-github-flavored-markdown \
    nativesdk-github.com-gobuffalo-tags-v3 \
"
GO_IMPORT = "github.com/gobuffalo/helpers"
inherit gosrc
inherit nativesdk
