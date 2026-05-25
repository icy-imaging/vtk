// java wrapper for vtkClosestNPointsStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkClosestNPointsStrategy extends vtkClosestPointStrategy
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

  private native void SetClosestNPoints_4(int id0);
  public void SetClosestNPoints(int id0)
  {
    SetClosestNPoints_4(id0);
  }

  private native int GetClosestNPointsMinValue_5();
  public int GetClosestNPointsMinValue()
  {
    return GetClosestNPointsMinValue_5();
  }

  private native int GetClosestNPointsMaxValue_6();
  public int GetClosestNPointsMaxValue()
  {
    return GetClosestNPointsMaxValue_6();
  }

  private native int GetClosestNPoints_7();
  public int GetClosestNPoints()
  {
    return GetClosestNPoints_7();
  }

  private native void CopyParameters_8(vtkFindCellStrategy id0);
  public void CopyParameters(vtkFindCellStrategy id0)
  {
    CopyParameters_8(id0);
  }

  private native int Initialize_9(vtkPointSet id0);
  public int Initialize(vtkPointSet id0)
  {
    return Initialize_9(id0);
  }

  public vtkClosestNPointsStrategy() { super(); }

  public vtkClosestNPointsStrategy(long id) { super(id); }
  public native long   VTKInit();

}
