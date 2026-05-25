// java wrapper for vtkContextMapper2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContextMapper2D extends vtkAlgorithm
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

  private native void SetInputData_4(vtkTable id0);
  public void SetInputData(vtkTable id0)
  {
    SetInputData_4(id0);
  }

  private native long GetInput_5();
  public vtkTable GetInput()
  {
    long temp = GetInput_5();

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInputArrayToProcess_6(int id0,vtkDataObject id1);
  public vtkDataArray GetInputArrayToProcess(int id0,vtkDataObject id1)
  {
    long temp = GetInputArrayToProcess_6(id0,id1);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInputAbstractArrayToProcess_7(int id0,vtkDataObject id1);
  public vtkAbstractArray GetInputAbstractArrayToProcess(int id0,vtkDataObject id1)
  {
    long temp = GetInputAbstractArrayToProcess_7(id0,id1);

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkContextMapper2D() { super(); }

  public vtkContextMapper2D(long id) { super(id); }
  public native long   VTKInit();

}
