// java wrapper for vtkDeserializer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDeserializer extends vtkObject
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

  private native void UnRegisterConstructor_4(byte[] id0, int len0);
  public void UnRegisterConstructor(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    UnRegisterConstructor_4(bytes0, bytes0.length);
  }

  private native void SetContext_5(vtkMarshalContext id0);
  public void SetContext(vtkMarshalContext id0)
  {
    SetContext_5(id0);
  }

  private native long GetContext_6();
  public vtkMarshalContext GetContext()
  {
    long temp = GetContext_6();

    if (temp == 0) return null;
    return (vtkMarshalContext)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkDeserializer() { super(); }

  public vtkDeserializer(long id) { super(id); }
  public native long   VTKInit();

}
