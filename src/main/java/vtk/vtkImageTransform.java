// java wrapper for vtkImageTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageTransform extends vtkObject
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

  private native void TransformPointSet_4(vtkImageData id0,vtkPointSet id1);
  public void TransformPointSet(vtkImageData id0,vtkPointSet id1)
  {
    TransformPointSet_4(id0,id1);
  }

  private native void TransformPointSet_5(vtkImageData id0,vtkPointSet id1,boolean id2,boolean id3);
  public void TransformPointSet(vtkImageData id0,vtkPointSet id1,boolean id2,boolean id3)
  {
    TransformPointSet_5(id0,id1,id2,id3);
  }

  private native void TranslatePoints_6(double id0[],vtkDataArray id1);
  public void TranslatePoints(double id0[],vtkDataArray id1)
  {
    TranslatePoints_6(id0,id1);
  }

  private native void TransformPoints_7(vtkMatrix4x4 id0,vtkDataArray id1);
  public void TransformPoints(vtkMatrix4x4 id0,vtkDataArray id1)
  {
    TransformPoints_7(id0,id1);
  }

  private native void TransformNormals_8(vtkMatrix3x3 id0,double id1[],vtkDataArray id2);
  public void TransformNormals(vtkMatrix3x3 id0,double id1[],vtkDataArray id2)
  {
    TransformNormals_8(id0,id1,id2);
  }

  private native void TransformVectors_9(vtkMatrix3x3 id0,double id1[],vtkDataArray id2);
  public void TransformVectors(vtkMatrix3x3 id0,double id1[],vtkDataArray id2)
  {
    TransformVectors_9(id0,id1,id2);
  }

  public vtkImageTransform() { super(); }

  public vtkImageTransform(long id) { super(id); }
  public native long   VTKInit();

}
