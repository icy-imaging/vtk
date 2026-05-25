// java wrapper for vtkInteractorStyleTerrain object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorStyleTerrain extends vtkInteractorStyle
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

  private native void OnMiddleButtonDown_7();
  public void OnMiddleButtonDown()
  {
    OnMiddleButtonDown_7();
  }

  private native void OnMiddleButtonUp_8();
  public void OnMiddleButtonUp()
  {
    OnMiddleButtonUp_8();
  }

  private native void OnRightButtonDown_9();
  public void OnRightButtonDown()
  {
    OnRightButtonDown_9();
  }

  private native void OnRightButtonUp_10();
  public void OnRightButtonUp()
  {
    OnRightButtonUp_10();
  }

  private native void OnChar_11();
  public void OnChar()
  {
    OnChar_11();
  }

  private native void Rotate_12();
  public void Rotate()
  {
    Rotate_12();
  }

  private native void Pan_13();
  public void Pan()
  {
    Pan_13();
  }

  private native void Dolly_14();
  public void Dolly()
  {
    Dolly_14();
  }

  private native void SetLatLongLines_15(int id0);
  public void SetLatLongLines(int id0)
  {
    SetLatLongLines_15(id0);
  }

  private native int GetLatLongLines_16();
  public int GetLatLongLines()
  {
    return GetLatLongLines_16();
  }

  private native void LatLongLinesOn_17();
  public void LatLongLinesOn()
  {
    LatLongLinesOn_17();
  }

  private native void LatLongLinesOff_18();
  public void LatLongLinesOff()
  {
    LatLongLinesOff_18();
  }

  public vtkInteractorStyleTerrain() { super(); }

  public vtkInteractorStyleTerrain(long id) { super(id); }
  public native long   VTKInit();

}
