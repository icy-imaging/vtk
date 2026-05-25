// java wrapper for vtkAMRBaseParticlesReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAMRBaseParticlesReader extends vtkMultiBlockDataSetAlgorithm
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

  private native int GetFrequency_4();
  public int GetFrequency()
  {
    return GetFrequency_4();
  }

  private native void SetFrequency_5(int id0);
  public void SetFrequency(int id0)
  {
    SetFrequency_5(id0);
  }

  private native long GetController_6();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_6();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetController_7(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_7(id0);
  }

  private native void SetFilterLocation_8(int id0);
  public void SetFilterLocation(int id0)
  {
    SetFilterLocation_8(id0);
  }

  private native int GetFilterLocation_9();
  public int GetFilterLocation()
  {
    return GetFilterLocation_9();
  }

  private native void FilterLocationOn_10();
  public void FilterLocationOn()
  {
    FilterLocationOn_10();
  }

  private native void FilterLocationOff_11();
  public void FilterLocationOff()
  {
    FilterLocationOff_11();
  }

  private native long GetParticleDataArraySelection_12();
  public vtkDataArraySelection GetParticleDataArraySelection()
  {
    long temp = GetParticleDataArraySelection_12();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfParticleArrays_13();
  public int GetNumberOfParticleArrays()
  {
    return GetNumberOfParticleArrays_13();
  }

  private native byte[] GetParticleArrayName_14(int id0);
  public String GetParticleArrayName(int id0)
  {
    return new String(GetParticleArrayName_14(id0), StandardCharsets.UTF_8);
  }

  private native int GetParticleArrayStatus_15(byte[] id0, int len0);
  public int GetParticleArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetParticleArrayStatus_15(bytes0, bytes0.length);
  }

  private native void SetParticleArrayStatus_16(byte[] id0, int len0,int id1);
  public void SetParticleArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetParticleArrayStatus_16(bytes0, bytes0.length,id1);
  }

  private native void SetFileName_17(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_17(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_18();
  public String GetFileName()
  {
    return new String(GetFileName_18(), StandardCharsets.UTF_8);
  }

  private native void SetMinLocation_19(double id0,double id1,double id2);
  public void SetMinLocation(double id0,double id1,double id2)
  {
    SetMinLocation_19(id0,id1,id2);
  }

  private native void SetMaxLocation_20(double id0,double id1,double id2);
  public void SetMaxLocation(double id0,double id1,double id2)
  {
    SetMaxLocation_20(id0,id1,id2);
  }

  private native int GetTotalNumberOfParticles_21();
  public int GetTotalNumberOfParticles()
  {
    return GetTotalNumberOfParticles_21();
  }

  public vtkAMRBaseParticlesReader() { super(); }

  public vtkAMRBaseParticlesReader(long id) { super(id); }

}
