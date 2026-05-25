// java wrapper for vtkPointCloudFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointCloudFilter extends vtkPolyDataAlgorithm
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

  private native long GetNumberOfPointsRemoved_4();
  public long GetNumberOfPointsRemoved()
  {
    return GetNumberOfPointsRemoved_4();
  }

  private native void SetGenerateOutliers_5(boolean id0);
  public void SetGenerateOutliers(boolean id0)
  {
    SetGenerateOutliers_5(id0);
  }

  private native boolean GetGenerateOutliers_6();
  public boolean GetGenerateOutliers()
  {
    return GetGenerateOutliers_6();
  }

  private native void GenerateOutliersOn_7();
  public void GenerateOutliersOn()
  {
    GenerateOutliersOn_7();
  }

  private native void GenerateOutliersOff_8();
  public void GenerateOutliersOff()
  {
    GenerateOutliersOff_8();
  }

  private native void SetGenerateVertices_9(boolean id0);
  public void SetGenerateVertices(boolean id0)
  {
    SetGenerateVertices_9(id0);
  }

  private native boolean GetGenerateVertices_10();
  public boolean GetGenerateVertices()
  {
    return GetGenerateVertices_10();
  }

  private native void GenerateVerticesOn_11();
  public void GenerateVerticesOn()
  {
    GenerateVerticesOn_11();
  }

  private native void GenerateVerticesOff_12();
  public void GenerateVerticesOff()
  {
    GenerateVerticesOff_12();
  }

  public vtkPointCloudFilter() { super(); }

  public vtkPointCloudFilter(long id) { super(id); }

}
