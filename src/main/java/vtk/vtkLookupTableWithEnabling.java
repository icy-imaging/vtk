// java wrapper for vtkLookupTableWithEnabling object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLookupTableWithEnabling extends vtkLookupTable
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

  private native long GetEnabledArray_4();
  public vtkDataArray GetEnabledArray()
  {
    long temp = GetEnabledArray_4();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetEnabledArray_5(vtkDataArray id0);
  public void SetEnabledArray(vtkDataArray id0)
  {
    SetEnabledArray_5(id0);
  }

  public vtkLookupTableWithEnabling() { super(); }

  public vtkLookupTableWithEnabling(long id) { super(id); }
  public native long   VTKInit();

}
