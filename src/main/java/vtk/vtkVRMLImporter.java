// java wrapper for vtkVRMLImporter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVRMLImporter extends vtkImporter
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetShapeResolution_6(int id0);
  public void SetShapeResolution(int id0)
  {
    SetShapeResolution_6(id0);
  }

  private native int GetShapeResolution_7();
  public int GetShapeResolution()
  {
    return GetShapeResolution_7();
  }

  private native long GetVRMLDEFObject_8(byte[] id0, int len0);
  public vtkObject GetVRMLDEFObject(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetVRMLDEFObject_8(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetOutputsDescription_9();
  public String GetOutputsDescription()
  {
    return new String(GetOutputsDescription_9(), StandardCharsets.UTF_8);
  }

  public vtkVRMLImporter() { super(); }

  public vtkVRMLImporter(long id) { super(id); }
  public native long   VTKInit();

}
