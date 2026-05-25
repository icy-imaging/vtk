// java wrapper for vtkGraphToGlyphs object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGraphToGlyphs extends vtkPolyDataAlgorithm
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

  private native void SetGlyphType_4(int id0);
  public void SetGlyphType(int id0)
  {
    SetGlyphType_4(id0);
  }

  private native int GetGlyphType_5();
  public int GetGlyphType()
  {
    return GetGlyphType_5();
  }

  private native void SetFilled_6(boolean id0);
  public void SetFilled(boolean id0)
  {
    SetFilled_6(id0);
  }

  private native boolean GetFilled_7();
  public boolean GetFilled()
  {
    return GetFilled_7();
  }

  private native void FilledOn_8();
  public void FilledOn()
  {
    FilledOn_8();
  }

  private native void FilledOff_9();
  public void FilledOff()
  {
    FilledOff_9();
  }

  private native void SetScreenSize_10(double id0);
  public void SetScreenSize(double id0)
  {
    SetScreenSize_10(id0);
  }

  private native double GetScreenSize_11();
  public double GetScreenSize()
  {
    return GetScreenSize_11();
  }

  private native void SetRenderer_12(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_12(id0);
  }

  private native long GetRenderer_13();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_13();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScaling_14(boolean id0);
  public void SetScaling(boolean id0)
  {
    SetScaling_14(id0);
  }

  private native boolean GetScaling_15();
  public boolean GetScaling()
  {
    return GetScaling_15();
  }

  private native long GetMTime_16();
  public long GetMTime()
  {
    return GetMTime_16();
  }

  public vtkGraphToGlyphs() { super(); }

  public vtkGraphToGlyphs(long id) { super(id); }
  public native long   VTKInit();

}
