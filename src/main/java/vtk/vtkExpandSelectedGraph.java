// java wrapper for vtkExpandSelectedGraph object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExpandSelectedGraph extends vtkSelectionAlgorithm
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

  private native void SetGraphConnection_4(vtkAlgorithmOutput id0);
  public void SetGraphConnection(vtkAlgorithmOutput id0)
  {
    SetGraphConnection_4(id0);
  }

  private native int FillInputPortInformation_5(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_5(id0,id1);
  }

  private native void SetBFSDistance_6(int id0);
  public void SetBFSDistance(int id0)
  {
    SetBFSDistance_6(id0);
  }

  private native int GetBFSDistance_7();
  public int GetBFSDistance()
  {
    return GetBFSDistance_7();
  }

  private native void SetIncludeShortestPaths_8(boolean id0);
  public void SetIncludeShortestPaths(boolean id0)
  {
    SetIncludeShortestPaths_8(id0);
  }

  private native boolean GetIncludeShortestPaths_9();
  public boolean GetIncludeShortestPaths()
  {
    return GetIncludeShortestPaths_9();
  }

  private native void IncludeShortestPathsOn_10();
  public void IncludeShortestPathsOn()
  {
    IncludeShortestPathsOn_10();
  }

  private native void IncludeShortestPathsOff_11();
  public void IncludeShortestPathsOff()
  {
    IncludeShortestPathsOff_11();
  }

  private native void SetDomain_12(byte[] id0, int len0);
  public void SetDomain(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDomain_12(bytes0, bytes0.length);
  }

  private native byte[] GetDomain_13();
  public String GetDomain()
  {
    return new String(GetDomain_13(), StandardCharsets.UTF_8);
  }

  private native void SetUseDomain_14(boolean id0);
  public void SetUseDomain(boolean id0)
  {
    SetUseDomain_14(id0);
  }

  private native boolean GetUseDomain_15();
  public boolean GetUseDomain()
  {
    return GetUseDomain_15();
  }

  private native void UseDomainOn_16();
  public void UseDomainOn()
  {
    UseDomainOn_16();
  }

  private native void UseDomainOff_17();
  public void UseDomainOff()
  {
    UseDomainOff_17();
  }

  public vtkExpandSelectedGraph() { super(); }

  public vtkExpandSelectedGraph(long id) { super(id); }
  public native long   VTKInit();

}
