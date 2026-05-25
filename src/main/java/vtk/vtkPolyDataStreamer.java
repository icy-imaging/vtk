// java wrapper for vtkPolyDataStreamer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyDataStreamer extends vtkStreamerBase
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

  private native void SetNumberOfStreamDivisions_4(int id0);
  public void SetNumberOfStreamDivisions(int id0)
  {
    SetNumberOfStreamDivisions_4(id0);
  }

  private native int GetNumberOfStreamDivisions_5();
  public int GetNumberOfStreamDivisions()
  {
    return GetNumberOfStreamDivisions_5();
  }

  private native void SetColorByPiece_6(int id0);
  public void SetColorByPiece(int id0)
  {
    SetColorByPiece_6(id0);
  }

  private native int GetColorByPiece_7();
  public int GetColorByPiece()
  {
    return GetColorByPiece_7();
  }

  private native void ColorByPieceOn_8();
  public void ColorByPieceOn()
  {
    ColorByPieceOn_8();
  }

  private native void ColorByPieceOff_9();
  public void ColorByPieceOff()
  {
    ColorByPieceOff_9();
  }

  public vtkPolyDataStreamer() { super(); }

  public vtkPolyDataStreamer(long id) { super(id); }
  public native long   VTKInit();

}
