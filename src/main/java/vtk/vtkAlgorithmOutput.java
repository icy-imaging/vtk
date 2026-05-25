// java wrapper for vtkAlgorithmOutput object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAlgorithmOutput extends vtkObject
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

  private native void SetIndex_4(int id0);
  public void SetIndex(int id0)
  {
    SetIndex_4(id0);
  }

  private native int GetIndex_5();
  public int GetIndex()
  {
    return GetIndex_5();
  }

  private native long GetProducer_6();
  public vtkAlgorithm GetProducer()
  {
    long temp = GetProducer_6();

    if (temp == 0) return null;
    return (vtkAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetProducer_7(vtkAlgorithm id0);
  public void SetProducer(vtkAlgorithm id0)
  {
    SetProducer_7(id0);
  }

  public vtkAlgorithmOutput() { super(); }

  public vtkAlgorithmOutput(long id) { super(id); }
  public native long   VTKInit();

}
