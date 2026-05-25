// java wrapper for vtkOBJWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOBJWriter extends vtkWriter
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

  private native long GetInputGeometry_4();
  public vtkPolyData GetInputGeometry()
  {
    long temp = GetInputGeometry_4();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInputTexture_5();
  public vtkImageData GetInputTexture()
  {
    long temp = GetInputTexture_5();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_6(int id0);
  public vtkDataSet GetInput(int id0)
  {
    long temp = GetInput_6(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTextureFileName_7(byte[] id0, int len0);
  public void SetTextureFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTextureFileName_7(bytes0, bytes0.length);
  }

  private native byte[] GetTextureFileName_8();
  public String GetTextureFileName()
  {
    return new String(GetTextureFileName_8(), StandardCharsets.UTF_8);
  }

  private native void SetFileName_9(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_9(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_10();
  public String GetFileName()
  {
    return new String(GetFileName_10(), StandardCharsets.UTF_8);
  }

  public vtkOBJWriter() { super(); }

  public vtkOBJWriter(long id) { super(id); }
  public native long   VTKInit();

}
