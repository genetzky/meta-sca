SUMMARY = "go.mod: github.com/hudl/fargo"
HOMEPAGE = "https://pkg.go.dev/github.com/hudl/fargo"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hudl-fargo-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-cenkalti-backoff-v4 \
    nativesdk-github.com-clbanning-mxj \
    nativesdk-github.com-franela-goreq \
    nativesdk-github.com-miekg-dns \
    nativesdk-github.com-op-go-logging \
    nativesdk-gopkg.in-gcfg.v1 \
"
GO_IMPORT = "github.com/hudl/fargo"
inherit gosrc
inherit nativesdk
