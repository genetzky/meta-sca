SUMMARY = "go.mod: github.com/jcmturner/gokrb5/v8"
HOMEPAGE = "https://pkg.go.dev/github.com/jcmturner/gokrb5/v8"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jcmturner-gokrb5-v8-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-gorilla-sessions \
    nativesdk-github.com-hashicorp-go-uuid \
    nativesdk-github.com-jcmturner-aescts-v2 \
    nativesdk-github.com-jcmturner-dnsutils-v2 \
    nativesdk-github.com-jcmturner-gofork \
    nativesdk-github.com-jcmturner-goidentity-v6 \
    nativesdk-github.com-jcmturner-rpc-v2 \
    nativesdk-golang.org-x-crypto \
"
GO_IMPORT = "github.com/jcmturner/gokrb5/v8"
inherit gosrc
inherit nativesdk
