// java wrapper for vtkFocalPlaneContourRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFocalPlaneContourRepresentation extends vtkContourRepresentation
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

  private native int GetIntermediatePointWorldPosition_4(int id0,int id1,double id2[]);
  public int GetIntermediatePointWorldPosition(int id0,int id1,double id2[])
  {
    return GetIntermediatePointWorldPosition_4(id0,id1,id2);
  }

  private native int GetIntermediatePointDisplayPosition_5(int id0,int id1,double id2[]);
  public int GetIntermediatePointDisplayPosition(int id0,int id1,double id2[])
  {
    return GetIntermediatePointDisplayPosition_5(id0,id1,id2);
  }

  private native int GetNthNodeDisplayPosition_6(int id0,double id1[]);
  public int GetNthNodeDisplayPosition(int id0,double id1[])
  {
    return GetNthNodeDisplayPosition_6(id0,id1);
  }

  private native int GetNthNodeWorldPosition_7(int id0,double id1[]);
  public int GetNthNodeWorldPosition(int id0,double id1[])
  {
    return GetNthNodeWorldPosition_7(id0,id1);
  }

  private native void UpdateContourWorldPositionsBasedOnDisplayPositions_8();
  public void UpdateContourWorldPositionsBasedOnDisplayPositions()
  {
    UpdateContourWorldPositionsBasedOnDisplayPositions_8();
  }

  private native int UpdateContour_9();
  public int UpdateContour()
  {
    return UpdateContour_9();
  }

  private native void UpdateLines_10(int id0);
  public void UpdateLines(int id0)
  {
    UpdateLines_10(id0);
  }

  public vtkFocalPlaneContourRepresentation() { super(); }

  public vtkFocalPlaneContourRepresentation(long id) { super(id); }

}
