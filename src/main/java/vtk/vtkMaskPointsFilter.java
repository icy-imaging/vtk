// java wrapper for vtkMaskPointsFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMaskPointsFilter extends vtkPointCloudFilter
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

  private native void SetMaskData_4(vtkDataObject id0);
  public void SetMaskData(vtkDataObject id0)
  {
    SetMaskData_4(id0);
  }

  private native long GetMask_5();
  public vtkDataObject GetMask()
  {
    long temp = GetMask_5();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMaskConnection_6(vtkAlgorithmOutput id0);
  public void SetMaskConnection(vtkAlgorithmOutput id0)
  {
    SetMaskConnection_6(id0);
  }

  private native void SetEmptyValue_7(byte id0);
  public void SetEmptyValue(byte id0)
  {
    SetEmptyValue_7(id0);
  }

  private native byte GetEmptyValue_8();
  public byte GetEmptyValue()
  {
    return GetEmptyValue_8();
  }

  public vtkMaskPointsFilter() { super(); }

  public vtkMaskPointsFilter(long id) { super(id); }
  public native long   VTKInit();

}
