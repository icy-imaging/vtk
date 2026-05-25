// java wrapper for vtkBlueObeliskData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBlueObeliskData extends vtkObject
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void Initialize_4();
  public void Initialize()
  {
    Initialize_4();
  }

  private native boolean IsInitialized_5();
  public boolean IsInitialized()
  {
    return IsInitialized_5();
  }

  private native void LockWriteMutex_6();
  public void LockWriteMutex()
  {
    LockWriteMutex_6();
  }

  private native void UnlockWriteMutex_7();
  public void UnlockWriteMutex()
  {
    UnlockWriteMutex_7();
  }

  private native short GetNumberOfElements_8();
  public short GetNumberOfElements()
  {
    return GetNumberOfElements_8();
  }

  private native long GetSymbols_9();
  public vtkStringArray GetSymbols()
  {
    long temp = GetSymbols_9();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLowerSymbols_10();
  public vtkStringArray GetLowerSymbols()
  {
    long temp = GetLowerSymbols_10();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNames_11();
  public vtkStringArray GetNames()
  {
    long temp = GetNames_11();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLowerNames_12();
  public vtkStringArray GetLowerNames()
  {
    long temp = GetLowerNames_12();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPeriodicTableBlocks_13();
  public vtkStringArray GetPeriodicTableBlocks()
  {
    long temp = GetPeriodicTableBlocks_13();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetElectronicConfigurations_14();
  public vtkStringArray GetElectronicConfigurations()
  {
    long temp = GetElectronicConfigurations_14();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFamilies_15();
  public vtkStringArray GetFamilies()
  {
    long temp = GetFamilies_15();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMasses_16();
  public vtkFloatArray GetMasses()
  {
    long temp = GetMasses_16();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetExactMasses_17();
  public vtkFloatArray GetExactMasses()
  {
    long temp = GetExactMasses_17();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetIonizationEnergies_18();
  public vtkFloatArray GetIonizationEnergies()
  {
    long temp = GetIonizationEnergies_18();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetElectronAffinities_19();
  public vtkFloatArray GetElectronAffinities()
  {
    long temp = GetElectronAffinities_19();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPaulingElectronegativities_20();
  public vtkFloatArray GetPaulingElectronegativities()
  {
    long temp = GetPaulingElectronegativities_20();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCovalentRadii_21();
  public vtkFloatArray GetCovalentRadii()
  {
    long temp = GetCovalentRadii_21();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVDWRadii_22();
  public vtkFloatArray GetVDWRadii()
  {
    long temp = GetVDWRadii_22();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDefaultColors_23();
  public vtkFloatArray GetDefaultColors()
  {
    long temp = GetDefaultColors_23();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBoilingPoints_24();
  public vtkFloatArray GetBoilingPoints()
  {
    long temp = GetBoilingPoints_24();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMeltingPoints_25();
  public vtkFloatArray GetMeltingPoints()
  {
    long temp = GetMeltingPoints_25();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPeriods_26();
  public vtkUnsignedShortArray GetPeriods()
  {
    long temp = GetPeriods_26();

    if (temp == 0) return null;
    return (vtkUnsignedShortArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGroups_27();
  public vtkUnsignedShortArray GetGroups()
  {
    long temp = GetGroups_27();

    if (temp == 0) return null;
    return (vtkUnsignedShortArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkBlueObeliskData() { super(); }

  public vtkBlueObeliskData(long id) { super(id); }
  public native long   VTKInit();

}
