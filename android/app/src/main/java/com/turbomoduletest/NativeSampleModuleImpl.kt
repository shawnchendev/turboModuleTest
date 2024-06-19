
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.fbreact.specs.NativeSampleModuleSpec
class NativeSampleModuleImpl(reactContext: ReactApplicationContext) : NativeSampleModuleSpec(reactContext) {

  override fun getName() = NAME

  override fun initialize(configJson: String, promise: Promise) {
    promise.resolve(configJson)
  }

  companion object {
    const val NAME = "NativeSampleModule"
  }
}
