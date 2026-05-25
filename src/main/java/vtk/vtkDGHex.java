// java wrapper for vtkDGHex object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDGHex extends vtkDeRhamCell
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

  private native int GetDimension_4();
  public int GetDimension()
  {
    return GetDimension_4();
  }

  private native int GetNumberOfSideTypes_5();
  public int GetNumberOfSideTypes()
  {
    return GetNumberOfSideTypes_5();
  }

  private native int GetNumberOfSidesOfDimension_6(int id0);
  public int GetNumberOfSidesOfDimension(int id0)
  {
    return GetNumberOfSidesOfDimension_6(id0);
  }

  private native long GetReferencePoints_7();
  public vtkTypeFloat32Array GetReferencePoints()
  {
    long temp = GetReferencePoints_7();

    if (temp == 0) return null;
    return (vtkTypeFloat32Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSideConnectivity_8();
  public vtkTypeInt32Array GetSideConnectivity()
  {
    long temp = GetSideConnectivity_8();

    if (temp == 0) return null;
    return (vtkTypeInt32Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSideOffsetsAndShapes_9();
  public vtkTypeInt32Array GetSideOffsetsAndShapes()
  {
    long temp = GetSideOffsetsAndShapes_9();

    if (temp == 0) return null;
    return (vtkTypeInt32Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkDGHex() { super(); }

  public vtkDGHex(long id) { super(id); }
  public native long   VTKInit();

}
