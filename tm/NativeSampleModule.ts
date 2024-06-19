import type {TurboModule} from 'react-native';
import {TurboModuleRegistry} from 'react-native';

export interface Spec extends TurboModule {
  initialize(configJson: string): Promise<string>;
}

export const NativeSampleModule = TurboModuleRegistry.getEnforcing<Spec>(
  'NativeSampleModule',
) as Spec | null;
