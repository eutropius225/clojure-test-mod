;; FIXME all the generated classes end up in the same package, which Mixin doesn't like.

(ns eutros.cljtestmod.mixin.ClojureTestMixin
  (:import net.minecraft.client.gui.screen.TitleScreen
           org.spongepowered.asm.mixin.Mixin
           org.spongepowered.asm.mixin.injection.At
           org.spongepowered.asm.mixin.injection.Inject))

(gen-class
 :name    ^{Mixin [TitleScreen]}
          eutros.cljtestmod.mixin.ClojureTestMixin
 :main    false
 :impl-ns eutros.cljtestmod.internal.ClojureTestMixin
 :load-impl-ns false
 :methods
          [[^{Inject   {:at     (At "HEAD")
                        :method "init()V"}
              :private true} init [org.spongepowered.asm.mixin.injection.callback.CallbackInfo] void]])
