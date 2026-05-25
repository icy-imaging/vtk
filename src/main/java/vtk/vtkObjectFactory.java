// java wrapper for vtkObjectFactory object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkObjectFactory extends vtkObject
{

  private native long CreateInstance_0(byte[] id0, int len0,boolean id1);
  public vtkObject CreateInstance(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = CreateInstance_0(bytes0, bytes0.length,id1);

    if (temp == 0) return null;
    return (vtkObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateAllInstance_1(byte[] id0, int len0,vtkCollection id1);
  public void CreateAllInstance(String id0,vtkCollection id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    CreateAllInstance_1(bytes0, bytes0.length,id1);
  }

  private native void ReHash_2();
  public void ReHash()
  {
    ReHash_2();
  }

  private native void RegisterFactory_3(vtkObjectFactory id0);
  public void RegisterFactory(vtkObjectFactory id0)
  {
    RegisterFactory_3(id0);
  }

  private native void UnRegisterFactory_4(vtkObjectFactory id0);
  public void UnRegisterFactory(vtkObjectFactory id0)
  {
    UnRegisterFactory_4(id0);
  }

  private native void UnRegisterAllFactories_5();
  public void UnRegisterAllFactories()
  {
    UnRegisterAllFactories_5();
  }

  private native long GetRegisteredFactories_6();
  public vtkObjectFactoryCollection GetRegisteredFactories()
  {
    long temp = GetRegisteredFactories_6();

    if (temp == 0) return null;
    return (vtkObjectFactoryCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int HasOverrideAny_7(byte[] id0, int len0);
  public int HasOverrideAny(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return HasOverrideAny_7(bytes0, bytes0.length);
  }

  private native void GetOverrideInformation_8(byte[] id0, int len0,vtkOverrideInformationCollection id1);
  public void GetOverrideInformation(String id0,vtkOverrideInformationCollection id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    GetOverrideInformation_8(bytes0, bytes0.length,id1);
  }

  private native void SetAllEnableFlags_9(int id0,byte[] id1, int len1);
  public void SetAllEnableFlags(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetAllEnableFlags_9(id0,bytes1, bytes1.length);
  }

  private native void SetAllEnableFlags_10(int id0,byte[] id1, int len1,byte[] id2, int len2);
  public void SetAllEnableFlags(int id0,String id1,String id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetAllEnableFlags_10(id0,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  private native int IsTypeOf_11(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_11(bytes0, bytes0.length);
  }

  private native int IsA_12(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_12(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_13(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_13(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_14(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_14(bytes0, bytes0.length);
  }

  private native byte[] GetVTKSourceVersion_15();
  public String GetVTKSourceVersion()
  {
    return new String(GetVTKSourceVersion_15(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDescription_16();
  public String GetDescription()
  {
    return new String(GetDescription_16(), StandardCharsets.UTF_8);
  }

  private native int GetNumberOfOverrides_17();
  public int GetNumberOfOverrides()
  {
    return GetNumberOfOverrides_17();
  }

  private native byte[] GetClassOverrideName_18(int id0);
  public String GetClassOverrideName(int id0)
  {
    return new String(GetClassOverrideName_18(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetClassOverrideWithName_19(int id0);
  public String GetClassOverrideWithName(int id0)
  {
    return new String(GetClassOverrideWithName_19(id0), StandardCharsets.UTF_8);
  }

  private native int GetEnableFlag_20(int id0);
  public int GetEnableFlag(int id0)
  {
    return GetEnableFlag_20(id0);
  }

  private native byte[] GetOverrideDescription_21(int id0);
  public String GetOverrideDescription(int id0)
  {
    return new String(GetOverrideDescription_21(id0), StandardCharsets.UTF_8);
  }

  private native void SetEnableFlag_22(int id0,byte[] id1, int len1,byte[] id2, int len2);
  public void SetEnableFlag(int id0,String id1,String id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetEnableFlag_22(id0,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  private native int GetEnableFlag_23(byte[] id0, int len0,byte[] id1, int len1);
  public int GetEnableFlag(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetEnableFlag_23(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native int HasOverride_24(byte[] id0, int len0);
  public int HasOverride(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return HasOverride_24(bytes0, bytes0.length);
  }

  private native int HasOverride_25(byte[] id0, int len0,byte[] id1, int len1);
  public int HasOverride(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return HasOverride_25(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void Disable_26(byte[] id0, int len0);
  public void Disable(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    Disable_26(bytes0, bytes0.length);
  }

  private native byte[] GetLibraryPath_27();
  public String GetLibraryPath()
  {
    return new String(GetLibraryPath_27(), StandardCharsets.UTF_8);
  }

  public vtkObjectFactory() { super(); }

  public vtkObjectFactory(long id) { super(id); }

}
