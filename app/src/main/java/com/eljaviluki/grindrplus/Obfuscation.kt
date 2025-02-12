package com.eljaviluki.grindrplus

object Obfuscation {
    object GApp {
        object base {
            private const val _base = Constants.GRINDR_PKG + ".base"

            object Experiment {
                private const val _experiment = "$_base.experiment"

                const val IExperimentsManager = "$_experiment.c"
            }
        }

        object experiment {
            private const val _experiment = Constants.GRINDR_PKG + ".experiment"

            const val Experiments = "$_experiment.a"
            object Experiments_ {
                const val uncheckedIsEnabled_expMgr = "c"
            }
        }

        object model {
            private const val _model = Constants.GRINDR_PKG + ".model"

            const val ExpiringImageBody = "$_model.ExpiringImageBody"
            object ExpiringImageBody_ {
                const val getDuration = "getDuration"
            }

            const val ExpiringPhotoStatusResponse = "$_model.ExpiringPhotoStatusResponse"
            object ExpiringPhotoStatusResponse_ {
                const val getTotal = "getTotal"
                const val getAvailable = "getAvailable"
            }

            const val Feature = "$_model.Feature"
            object Feature_ {
                const val isGranted = "isGranted"
            }
        }

        object persistence {
            private const val _persistence = Constants.GRINDR_PKG + ".persistence"

            object model {
                private const val _model = "$_persistence.model"

                const val ChatMessage = "$_model.ChatMessage"
                object ChatMessage_ {
                    const val TAP_TYPE_NONE = "TAP_TYPE_NONE"
                }

                const val Profile = "$_model.Profile"
            }

            object repository {
                private const val _repository = "$_persistence.repository"

                const val ChatRepo = "$_repository.ChatRepo"
                object ChatRepo_ {
                    const val checkMessageForVideoCall = "checkMessageForVideoCall"
                }
            }
        }

        object R {
            private const val _R_base = Constants.GRINDR_PKG

            const val color = "$_R_base.h0"
            object color_ {
                const val grindr_gold_star_gay = "u"
                //const val grindr_pure_white = "L" // seems gone
            }
        }

        object storage {
            private const val _storage = Constants.GRINDR_PKG + ".storage"

            const val UserSession = "$_storage.o0"
            const val UserSession2 = "$_storage.p0"

            const val IUserSession = "$_storage.IUserSession"
            object IUserSession_ {
                const val hasFeature_feature = "a"
                const val isFree = "j"
                const val isNoXtraUpsell = "p"
                const val isXtra = "g"
                const val isUnlimited = "q"
            }
        }

        object ui {
            private const val _ui = Constants.GRINDR_PKG + ".ui"

            object profileV2 {
                private const val _profileV2 = "$_ui.profileV2"

                const val ProfileFieldsView = "$_profileV2.ProfileFieldsView"
                object ProfileFieldsView_ {
                    //const val setProfile = "setProfile"   // gone
                }
            }
        }

        object utils {
            private const val _utils = Constants.GRINDR_PKG + ".utils"

            const val ProfileUtils = "$_utils.w0"
            object ProfileUtils_ {
                const val onlineIndicatorDuration = "b"
            }
        }

        object view {
            private const val _view = Constants.GRINDR_PKG + ".view"

            /* unused
            const val ExtendedProfileFieldView = "$_view.bv"
            object ExtendedProfileFieldView_ {
                const val setLabel = "a"
                const val setValue = "b"
            }
            */

            const val TapsAnimLayout = "$_view.TapsAnimLayout"
            object TapsAnimLayout_ {
                const val tapType = "h"

                const val getCanSelectVariants = "getCanSelectVariants"
                const val setTapType = "S"
            }
        }
    }
}