// java wrapper for vtkPiecewisePointHandleItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPiecewisePointHandleItem extends vtkContextItem
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

  private native void SetParent_4(vtkAbstractContextItem id0);
  public void SetParent(vtkAbstractContextItem id0)
  {
    SetParent_4(id0);
  }

  private native boolean Paint_5(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_5(id0);
  }

  private native void SetCurrentPointIndex_6(long id0);
  public void SetCurrentPointIndex(long id0)
  {
    SetCurrentPointIndex_6(id0);
  }

  private native long GetCurrentPointIndex_7();
  public long GetCurrentPointIndex()
  {
    return GetCurrentPointIndex_7();
  }

  private native void SetPiecewiseFunction_8(vtkPiecewiseFunction id0);
  public void SetPiecewiseFunction(vtkPiecewiseFunction id0)
  {
    SetPiecewiseFunction_8(id0);
  }

  public vtkPiecewisePointHandleItem() { super(); }

  public vtkPiecewisePointHandleItem(long id) { super(id); }
  public native long   VTKInit();

}
