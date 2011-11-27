all: compile-modules

.PHONY: compile-modules


compile-modules:
	$(MAKE) -C classlib
	$(MAKE) -C drlvm
	@mkdir target/hdk
	@mv drlvm/deploy target/hdk
