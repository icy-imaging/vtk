// java wrapper for vtkOpenGLCellToVTKCellMap object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLCellToVTKCellMap extends vtkObject
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

  private native long ConvertOpenGLCellIdToVTKCellId_4(boolean id0,long id1);
  public long ConvertOpenGLCellIdToVTKCellId(boolean id0,long id1)
  {
    return ConvertOpenGLCellIdToVTKCellId_4(id0,id1);
  }

  private native void SetStartOffset_5(long id0);
  public void SetStartOffset(long id0)
  {
    SetStartOffset_5(id0);
  }

  private native long GetFinalOffset_6();
  public long GetFinalOffset()
  {
    return GetFinalOffset_6();
  }

  public vtkOpenGLCellToVTKCellMap() { super(); }

  public vtkOpenGLCellToVTKCellMap(long id) { super(id); }
  public native long   VTKInit();

}
