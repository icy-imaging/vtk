// java wrapper for vtkImageCursor3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageCursor3D extends vtkImageInPlaceFilter
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

  private native void SetCursorPosition_4(double id0,double id1,double id2);
  public void SetCursorPosition(double id0,double id1,double id2)
  {
    SetCursorPosition_4(id0,id1,id2);
  }

  private native void SetCursorPosition_5(double id0[]);
  public void SetCursorPosition(double id0[])
  {
    SetCursorPosition_5(id0);
  }

  private native double[] GetCursorPosition_6();
  public double[] GetCursorPosition()
  {
    return GetCursorPosition_6();
  }

  private native void SetCursorValue_7(double id0);
  public void SetCursorValue(double id0)
  {
    SetCursorValue_7(id0);
  }

  private native double GetCursorValue_8();
  public double GetCursorValue()
  {
    return GetCursorValue_8();
  }

  private native void SetCursorRadius_9(int id0);
  public void SetCursorRadius(int id0)
  {
    SetCursorRadius_9(id0);
  }

  private native int GetCursorRadius_10();
  public int GetCursorRadius()
  {
    return GetCursorRadius_10();
  }

  public vtkImageCursor3D() { super(); }

  public vtkImageCursor3D(long id) { super(id); }
  public native long   VTKInit();

}
