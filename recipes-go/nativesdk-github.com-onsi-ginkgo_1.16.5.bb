SUMMARY = "go.mod: github.com/onsi/ginkgo"
HOMEPAGE = "https://pkg.go.dev/github.com/onsi/ginkgo"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-onsi-ginkgo-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-go-task-slim-sprig \
    nativesdk-github.com-nxadm-tail \
    nativesdk-github.com-onsi-gomega \
    nativesdk-golang.org-x-sys \
    nativesdk-golang.org-x-tools \
"
GO_IMPORT = "github.com/onsi/ginkgo"
inherit gosrc
inherit nativesdk
