// java wrapper for vtkGaussianCubeReader2 object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGaussianCubeReader2 extends vtkMoleculeAlgorithm
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

  private native long GetOutput_4();
  public vtkMolecule GetOutput()
  {
    long temp = GetOutput_4();

    if (temp == 0) return null;
    return (vtkMolecule)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutput_5(vtkMolecule id0);
  public void SetOutput(vtkMolecule id0)
  {
    SetOutput_5(id0);
  }

  private native long GetGridOutput_6();
  public vtkImageData GetGridOutput()
  {
    long temp = GetGridOutput_6();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFileName_7(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_7(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_8();
  public String GetFileName()
  {
    return new String(GetFileName_8(), StandardCharsets.UTF_8);
  }

  public vtkGaussianCubeReader2() { super(); }

  public vtkGaussianCubeReader2(long id) { super(id); }
  public native long   VTKInit();

}
