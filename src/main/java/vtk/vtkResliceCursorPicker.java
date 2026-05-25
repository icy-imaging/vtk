// java wrapper for vtkResliceCursorPicker object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkResliceCursorPicker extends vtkPicker
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

  private native int Pick_4(double id0,double id1,double id2,vtkRenderer id3);
  public int Pick(double id0,double id1,double id2,vtkRenderer id3)
  {
    return Pick_4(id0,id1,id2,id3);
  }

  private native int GetPickedAxis1_5();
  public int GetPickedAxis1()
  {
    return GetPickedAxis1_5();
  }

  private native int GetPickedAxis2_6();
  public int GetPickedAxis2()
  {
    return GetPickedAxis2_6();
  }

  private native int GetPickedCenter_7();
  public int GetPickedCenter()
  {
    return GetPickedCenter_7();
  }

  private native void SetResliceCursorAlgorithm_8(vtkResliceCursorPolyDataAlgorithm id0);
  public void SetResliceCursorAlgorithm(vtkResliceCursorPolyDataAlgorithm id0)
  {
    SetResliceCursorAlgorithm_8(id0);
  }

  private native long GetResliceCursorAlgorithm_9();
  public vtkResliceCursorPolyDataAlgorithm GetResliceCursorAlgorithm()
  {
    long temp = GetResliceCursorAlgorithm_9();

    if (temp == 0) return null;
    return (vtkResliceCursorPolyDataAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTransformMatrix_10(vtkMatrix4x4 id0);
  public void SetTransformMatrix(vtkMatrix4x4 id0)
  {
    SetTransformMatrix_10(id0);
  }

  private native void Pick_11(double id0[],double id1[],vtkRenderer id2);
  public void Pick(double id0[],double id1[],vtkRenderer id2)
  {
    Pick_11(id0,id1,id2);
  }

  public vtkResliceCursorPicker() { super(); }

  public vtkResliceCursorPicker(long id) { super(id); }
  public native long   VTKInit();

}
