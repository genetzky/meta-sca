SUMMARY = "go.mod: github.com/nxadm/tail"
HOMEPAGE = "https://pkg.go.dev/github.com/nxadm/tail"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-nxadm-tail-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-fsnotify-fsnotify \
    nativesdk-gopkg.in-tomb.v1 \
"
GO_IMPORT = "github.com/nxadm/tail"
inherit gosrc
inherit nativesdk
