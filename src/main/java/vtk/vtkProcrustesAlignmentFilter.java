// java wrapper for vtkProcrustesAlignmentFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProcrustesAlignmentFilter extends vtkMultiBlockDataSetAlgorithm
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

  private native long GetLandmarkTransform_4();
  public vtkLandmarkTransform GetLandmarkTransform()
  {
    long temp = GetLandmarkTransform_4();

    if (temp == 0) return null;
    return (vtkLandmarkTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMeanPoints_5();
  public vtkPoints GetMeanPoints()
  {
    long temp = GetMeanPoints_5();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetStartFromCentroid_6(boolean id0);
  public void SetStartFromCentroid(boolean id0)
  {
    SetStartFromCentroid_6(id0);
  }

  private native boolean GetStartFromCentroid_7();
  public boolean GetStartFromCentroid()
  {
    return GetStartFromCentroid_7();
  }

  private native void StartFromCentroidOn_8();
  public void StartFromCentroidOn()
  {
    StartFromCentroidOn_8();
  }

  private native void StartFromCentroidOff_9();
  public void StartFromCentroidOff()
  {
    StartFromCentroidOff_9();
  }

  private native void SetOutputPointsPrecision_10(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_10(id0);
  }

  private native int GetOutputPointsPrecision_11();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_11();
  }

  public vtkProcrustesAlignmentFilter() { super(); }

  public vtkProcrustesAlignmentFilter(long id) { super(id); }
  public native long   VTKInit();

}
