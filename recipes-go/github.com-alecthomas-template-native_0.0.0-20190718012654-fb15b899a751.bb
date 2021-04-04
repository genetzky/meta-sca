SUMMARY = "go.mod: github.com/alecthomas/template"
HOMEPAGE = "https://pkg.go.dev/github.com/alecthomas/template"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-alecthomas-template-sources.inc

GO_IMPORT = "github.com/alecthomas/template"

inherit gosrc
inherit native
