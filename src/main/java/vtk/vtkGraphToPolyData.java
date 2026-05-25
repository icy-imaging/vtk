// java wrapper for vtkGraphToPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGraphToPolyData extends vtkPolyDataAlgorithm
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

  private native void SetEdgeGlyphOutput_4(boolean id0);
  public void SetEdgeGlyphOutput(boolean id0)
  {
    SetEdgeGlyphOutput_4(id0);
  }

  private native boolean GetEdgeGlyphOutput_5();
  public boolean GetEdgeGlyphOutput()
  {
    return GetEdgeGlyphOutput_5();
  }

  private native void EdgeGlyphOutputOn_6();
  public void EdgeGlyphOutputOn()
  {
    EdgeGlyphOutputOn_6();
  }

  private native void EdgeGlyphOutputOff_7();
  public void EdgeGlyphOutputOff()
  {
    EdgeGlyphOutputOff_7();
  }

  private native void SetEdgeGlyphPosition_8(double id0);
  public void SetEdgeGlyphPosition(double id0)
  {
    SetEdgeGlyphPosition_8(id0);
  }

  private native double GetEdgeGlyphPosition_9();
  public double GetEdgeGlyphPosition()
  {
    return GetEdgeGlyphPosition_9();
  }

  public vtkGraphToPolyData() { super(); }

  public vtkGraphToPolyData(long id) { super(id); }
  public native long   VTKInit();

}
