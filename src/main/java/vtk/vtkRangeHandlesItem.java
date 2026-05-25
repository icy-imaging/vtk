// java wrapper for vtkRangeHandlesItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRangeHandlesItem extends vtkPlotRangeHandlesItem
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

  private native boolean Paint_4(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_4(id0);
  }

  private native void GetBounds_5(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_5(id0);
  }

  private native void GetHandlesRange_6(double id0[]);
  public void GetHandlesRange(double id0[])
  {
    GetHandlesRange_6(id0);
  }

  private native void SetColorTransferFunction_7(vtkColorTransferFunction id0);
  public void SetColorTransferFunction(vtkColorTransferFunction id0)
  {
    SetColorTransferFunction_7(id0);
  }

  private native long GetColorTransferFunction_8();
  public vtkColorTransferFunction GetColorTransferFunction()
  {
    long temp = GetColorTransferFunction_8();

    if (temp == 0) return null;
    return (vtkColorTransferFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ComputeHandlesDrawRange_9();
  public void ComputeHandlesDrawRange()
  {
    ComputeHandlesDrawRange_9();
  }

  private native void SynchronizeRangeHandlesOn_10();
  public void SynchronizeRangeHandlesOn()
  {
    SynchronizeRangeHandlesOn_10();
  }

  private native void SetSynchronizeRangeHandles_11(int id0);
  public void SetSynchronizeRangeHandles(int id0)
  {
    SetSynchronizeRangeHandles_11(id0);
  }

  private native void SetHandleOrientation_12(int id0);
  public void SetHandleOrientation(int id0)
  {
    SetHandleOrientation_12(id0);
  }

  public vtkRangeHandlesItem() { super(); }

  public vtkRangeHandlesItem(long id) { super(id); }
  public native long   VTKInit();

}
