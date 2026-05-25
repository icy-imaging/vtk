// java wrapper for vtkInteractorStyleDrawPolygon object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorStyleDrawPolygon extends vtkInteractorStyle
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

  private native void OnMouseMove_4();
  public void OnMouseMove()
  {
    OnMouseMove_4();
  }

  private native void OnLeftButtonDown_5();
  public void OnLeftButtonDown()
  {
    OnLeftButtonDown_5();
  }

  private native void OnLeftButtonUp_6();
  public void OnLeftButtonUp()
  {
    OnLeftButtonUp_6();
  }

  private native void SetDrawPolygonPixels_7(boolean id0);
  public void SetDrawPolygonPixels(boolean id0)
  {
    SetDrawPolygonPixels_7(id0);
  }

  private native boolean GetDrawPolygonPixels_8();
  public boolean GetDrawPolygonPixels()
  {
    return GetDrawPolygonPixels_8();
  }

  private native void DrawPolygonPixelsOn_9();
  public void DrawPolygonPixelsOn()
  {
    DrawPolygonPixelsOn_9();
  }

  private native void DrawPolygonPixelsOff_10();
  public void DrawPolygonPixelsOff()
  {
    DrawPolygonPixelsOff_10();
  }

  public vtkInteractorStyleDrawPolygon() { super(); }

  public vtkInteractorStyleDrawPolygon(long id) { super(id); }
  public native long   VTKInit();

}
