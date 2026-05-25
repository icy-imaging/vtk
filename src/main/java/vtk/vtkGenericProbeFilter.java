// java wrapper for vtkGenericProbeFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericProbeFilter extends vtkDataSetAlgorithm
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

  private native void SetSourceData_4(vtkGenericDataSet id0);
  public void SetSourceData(vtkGenericDataSet id0)
  {
    SetSourceData_4(id0);
  }

  private native long GetSource_5();
  public vtkGenericDataSet GetSource()
  {
    long temp = GetSource_5();

    if (temp == 0) return null;
    return (vtkGenericDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetValidPoints_6();
  public vtkIdTypeArray GetValidPoints()
  {
    long temp = GetValidPoints_6();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkGenericProbeFilter() { super(); }

  public vtkGenericProbeFilter(long id) { super(id); }
  public native long   VTKInit();

}
