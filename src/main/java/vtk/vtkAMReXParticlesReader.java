// java wrapper for vtkAMReXParticlesReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAMReXParticlesReader extends vtkMultiBlockDataSetAlgorithm
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

  private native void SetPlotFileName_4(byte[] id0, int len0);
  public void SetPlotFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPlotFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetPlotFileName_5();
  public String GetPlotFileName()
  {
    return new String(GetPlotFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetParticleType_6(byte[] id0, int len0);
  public void SetParticleType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetParticleType_6(bytes0, bytes0.length);
  }

  private native byte[] GetParticleType_7();
  public String GetParticleType()
  {
    return new String(GetParticleType_7(), StandardCharsets.UTF_8);
  }

  private native long GetPointDataArraySelection_8();
  public vtkDataArraySelection GetPointDataArraySelection()
  {
    long temp = GetPointDataArraySelection_8();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int CanReadFile_9(byte[] id0, int len0,byte[] id1, int len1);
  public int CanReadFile(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_9(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void SetController_10(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_10(id0);
  }

  private native long GetController_11();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_11();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkAMReXParticlesReader() { super(); }

  public vtkAMReXParticlesReader(long id) { super(id); }
  public native long   VTKInit();

}
