// java wrapper for vtkBezierCurve object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBezierCurve extends vtkHigherOrderCurve
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

  private native int GetCellType_4();
  public int GetCellType()
  {
    return GetCellType_4();
  }

  private native void SetRationalWeightsFromPointData_5(vtkPointData id0,long id1);
  public void SetRationalWeightsFromPointData(vtkPointData id0,long id1)
  {
    SetRationalWeightsFromPointData_5(id0,id1);
  }

  private native long GetRationalWeights_6();
  public vtkDoubleArray GetRationalWeights()
  {
    long temp = GetRationalWeights_6();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkBezierCurve() { super(); }

  public vtkBezierCurve(long id) { super(id); }
  public native long   VTKInit();

}
