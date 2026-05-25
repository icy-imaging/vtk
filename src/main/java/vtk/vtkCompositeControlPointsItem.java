// java wrapper for vtkCompositeControlPointsItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCompositeControlPointsItem extends vtkColorTransferControlPointsItem
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

  private native void SetColorTransferFunction_4(vtkColorTransferFunction id0);
  public void SetColorTransferFunction(vtkColorTransferFunction id0)
  {
    SetColorTransferFunction_4(id0);
  }

  private native void SetOpacityFunction_5(vtkPiecewiseFunction id0);
  public void SetOpacityFunction(vtkPiecewiseFunction id0)
  {
    SetOpacityFunction_5(id0);
  }

  private native long GetOpacityFunction_6();
  public vtkPiecewiseFunction GetOpacityFunction()
  {
    long temp = GetOpacityFunction_6();

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPointsFunction_7(int id0);
  public void SetPointsFunction(int id0)
  {
    SetPointsFunction_7(id0);
  }

  private native int GetPointsFunction_8();
  public int GetPointsFunction()
  {
    return GetPointsFunction_8();
  }

  private native void SetUseOpacityPointHandles_9(boolean id0);
  public void SetUseOpacityPointHandles(boolean id0)
  {
    SetUseOpacityPointHandles_9(id0);
  }

  private native boolean GetUseOpacityPointHandles_10();
  public boolean GetUseOpacityPointHandles()
  {
    return GetUseOpacityPointHandles_10();
  }

  private native long GetNumberOfPoints_11();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_11();
  }

  private native void GetControlPoint_12(long id0,double id1[]);
  public void GetControlPoint(long id0,double id1[])
  {
    GetControlPoint_12(id0,id1);
  }

  private native long RemovePoint_13(long id0);
  public long RemovePoint(long id0)
  {
    return RemovePoint_13(id0);
  }

  public vtkCompositeControlPointsItem() { super(); }

  public vtkCompositeControlPointsItem(long id) { super(id); }
  public native long   VTKInit();

}
