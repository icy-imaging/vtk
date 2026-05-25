// java wrapper for vtkEmptyRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEmptyRepresentation extends vtkDataRepresentation
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

  private native long GetInternalAnnotationOutputPort_4();
  public vtkAlgorithmOutput GetInternalAnnotationOutputPort()
  {
    long temp = GetInternalAnnotationOutputPort_4();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInternalAnnotationOutputPort_5(int id0);
  public vtkAlgorithmOutput GetInternalAnnotationOutputPort(int id0)
  {
    long temp = GetInternalAnnotationOutputPort_5(id0);

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInternalAnnotationOutputPort_6(int id0,int id1);
  public vtkAlgorithmOutput GetInternalAnnotationOutputPort(int id0,int id1)
  {
    long temp = GetInternalAnnotationOutputPort_6(id0,id1);

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkEmptyRepresentation() { super(); }

  public vtkEmptyRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
