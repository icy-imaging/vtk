// java wrapper for vtkSpherePuzzle object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSpherePuzzle extends vtkPolyDataAlgorithm
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

  private native void Reset_4();
  public void Reset()
  {
    Reset_4();
  }

  private native void MoveHorizontal_5(int id0,int id1,int id2);
  public void MoveHorizontal(int id0,int id1,int id2)
  {
    MoveHorizontal_5(id0,id1,id2);
  }

  private native void MoveVertical_6(int id0,int id1,int id2);
  public void MoveVertical(int id0,int id1,int id2)
  {
    MoveVertical_6(id0,id1,id2);
  }

  private native int SetPoint_7(double id0,double id1,double id2);
  public int SetPoint(double id0,double id1,double id2)
  {
    return SetPoint_7(id0,id1,id2);
  }

  private native void MovePoint_8(int id0);
  public void MovePoint(int id0)
  {
    MovePoint_8(id0);
  }

  public vtkSpherePuzzle() { super(); }

  public vtkSpherePuzzle(long id) { super(id); }
  public native long   VTKInit();

}
