// java wrapper for vtkContourTriangulator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContourTriangulator extends vtkPolyDataAlgorithm
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

  private native int GetTriangulationError_4();
  public int GetTriangulationError()
  {
    return GetTriangulationError_4();
  }

  private native void SetTriangulationErrorDisplay_5(int id0);
  public void SetTriangulationErrorDisplay(int id0)
  {
    SetTriangulationErrorDisplay_5(id0);
  }

  private native void TriangulationErrorDisplayOn_6();
  public void TriangulationErrorDisplayOn()
  {
    TriangulationErrorDisplayOn_6();
  }

  private native void TriangulationErrorDisplayOff_7();
  public void TriangulationErrorDisplayOff()
  {
    TriangulationErrorDisplayOff_7();
  }

  private native int GetTriangulationErrorDisplay_8();
  public int GetTriangulationErrorDisplay()
  {
    return GetTriangulationErrorDisplay_8();
  }

  private native int TriangulatePolygon_9(vtkIdList id0,vtkPoints id1,vtkCellArray id2);
  public int TriangulatePolygon(vtkIdList id0,vtkPoints id1,vtkCellArray id2)
  {
    return TriangulatePolygon_9(id0,id1,id2);
  }

  private native int TriangulateContours_10(vtkPolyData id0,long id1,long id2,vtkCellArray id3,double id4[],vtkPolyDataAlgorithm id5);
  public int TriangulateContours(vtkPolyData id0,long id1,long id2,vtkCellArray id3,double id4[],vtkPolyDataAlgorithm id5)
  {
    return TriangulateContours_10(id0,id1,id2,id3,id4,id5);
  }

  public vtkContourTriangulator() { super(); }

  public vtkContourTriangulator(long id) { super(id); }
  public native long   VTKInit();

}
