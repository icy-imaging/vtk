// java wrapper for vtkOverrideInformation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOverrideInformation extends vtkObject
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

  private native byte[] GetClassOverrideName_4();
  public String GetClassOverrideName()
  {
    return new String(GetClassOverrideName_4(), StandardCharsets.UTF_8);
  }

  private native byte[] GetClassOverrideWithName_5();
  public String GetClassOverrideWithName()
  {
    return new String(GetClassOverrideWithName_5(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDescription_6();
  public String GetDescription()
  {
    return new String(GetDescription_6(), StandardCharsets.UTF_8);
  }

  private native long GetObjectFactory_7();
  public vtkObjectFactory GetObjectFactory()
  {
    long temp = GetObjectFactory_7();

    if (temp == 0) return null;
    return (vtkObjectFactory)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetClassOverrideName_8(byte[] id0, int len0);
  public void SetClassOverrideName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetClassOverrideName_8(bytes0, bytes0.length);
  }

  private native void SetClassOverrideWithName_9(byte[] id0, int len0);
  public void SetClassOverrideWithName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetClassOverrideWithName_9(bytes0, bytes0.length);
  }

  private native void SetDescription_10(byte[] id0, int len0);
  public void SetDescription(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDescription_10(bytes0, bytes0.length);
  }

  public vtkOverrideInformation() { super(); }

  public vtkOverrideInformation(long id) { super(id); }
  public native long   VTKInit();

}
